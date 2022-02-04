import { Component, OnInit } from '@angular/core';
import { Lawyer } from '../lawyer';
import { LawyerService } from '../lawyer.service';


@Component({
  selector: 'app-lawyer',
  templateUrl: './lawyer.component.html',
  styleUrls: ['./lawyer.component.css']
})
export class LawyerComponent implements OnInit {

   lawyers!: Lawyer[];

  constructor(private lawyerService: LawyerService) { }

  ngOnInit(): void {
    this.lawyerService.getLawyers().subscribe((data: Lawyer[]) => {
      console.log(data);
      this.lawyers = data;
      
    })
  }

}
