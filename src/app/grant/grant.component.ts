import { Component, OnInit } from '@angular/core';
import { Grant } from '../grant';
import { GrantService } from '../grant.service';

@Component({
  selector: 'app-grant',
  templateUrl: './grant.component.html',
  styleUrls: ['./grant.component.css']
})
export class GrantComponent implements OnInit {

  grants!: Grant[];

  constructor(private grantService:GrantService) { }

  ngOnInit(): void {
    this.grantService.getGrants().subscribe((data: Grant[]) => {
      console.log(data);
      this.grants = data;
      
    })
  }

}
