import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Lawyer } from './lawyer';

@Injectable({
  providedIn: 'root'
})
export class LawyerService {

  private baseUrl = "http://localhost:9092/api/resource/lawyers"

  constructor(private http:HttpClient) { }

  getLawyers():Observable<Lawyer[]>{
    return this.http.get<Lawyer[]>(`${this.baseUrl}`);
  }
  
}
