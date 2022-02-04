import { Component, OnInit } from '@angular/core';
import { Clinic } from '../clinic';
import { ClinicService } from '../clinic.service';

@Component({
  selector: 'app-clinic',
  templateUrl: './clinic.component.html',
  styleUrls: ['./clinic.component.css']
})
export class ClinicComponent implements OnInit {

  clinics!: Clinic[];

  constructor(private clinicService:ClinicService) { }

  ngOnInit(): void {
    this.clinicService.getClinics().subscribe((data: Clinic[]) => {
      console.log(data);
      this.clinics = data;
      
    })

  }

}
