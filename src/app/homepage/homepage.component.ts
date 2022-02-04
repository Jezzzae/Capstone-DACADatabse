import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  path:string = '../assets/images';
  images = [`${this.path}/butterfly.png`, `${this.path}/daca.png`, `${this.path}/news.png`];


}


