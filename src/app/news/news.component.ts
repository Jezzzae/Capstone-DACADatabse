import { Component, OnInit } from '@angular/core';
import { Newz } from '../newz';
import { NewzService } from '../newz.service';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  newz!:Newz[];

  constructor(private newzService:NewzService) { }

  ngOnInit(): void {
    this.newzService.getNews().subscribe((data: Newz[]) => {
      console.log(data);
      this.newz = data;
      
    })
  }

}
