import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Newz } from './newz';

@Injectable({
  providedIn: 'root'
})
export class NewzService {
  
  private baseUrl = "http://localhost:9092/api/resource/news"


  constructor(private http:HttpClient) { }

  getNews():Observable<Newz[]>{
    return this.http.get<Newz[]>(`${this.baseUrl}`);
  }

}
