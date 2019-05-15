import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
/* import { Patient } from './patient/patient-registration/patient';  */

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  currentDoctor:any;

  private baseUrl = 'http://localhost:5555/doctor';

  constructor(private http:HttpClient) { }

  registerDoctor(doctor:Object):Observable<Object>{
    console.log(doctor);
    return this.http.post(`http://localhost:8887/doctorservice/register`, doctor); 


  }
  loginDoctor(email:string,password:string):Observable<Object>{
    console.log(email+password)
    return this.http.get(`http://localhost:8887/doctorservice/login?userName=${email}&password=${password}`)

  }

  viewAppointments():Observable<Object>{
    return this.http.get(`http://localhost:8887/doctorappointments/getAllAppointments?email=${this.currentDoctor.emailId}`); 


  }

  saveDoctor(doctor:any){
    this.currentDoctor=doctor;


  }


 /*  createUser(userAccount: Object): Observable<Object> {
    console.log(userAccount)
    return this.http.post(`${this.baseUrl}` + `/create`, userAccount);
  } */ 
}
