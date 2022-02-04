import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Clinic } from './clinic';

@Injectable({
  providedIn: 'root'
})
export class ClinicService {

  constructor(private http:HttpClient) { }

  private baseUrl = "http://localhost:9092/api/resource/clinics"

  getClinics():Observable<Clinic[]>{
    return this.http.get<Clinic[]>(`${this.baseUrl}`);
  }

}
