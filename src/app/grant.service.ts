import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Grant } from './grant';

@Injectable({
  providedIn: 'root'
})
export class GrantService {

  constructor(private http: HttpClient) { }

  private baseUrl = "http://localhost:9092/api/resource/grants"


  getGrants():Observable<Grant[]>{
    return this.http.get<Grant[]>(`${this.baseUrl}`);
  }

}
