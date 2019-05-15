import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

/* import { Patient } from './patient/patient-registration/patient';  */

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  currentPatient:any=null;


  constructor(private http:HttpClient) { }

  registerPatient(patient:Object):Observable<Object>{
    console.log(patient);
    return this.http.post(`http://localhost:8887/patient/create`, patient); 


  } 





  loginPatient(patientEmail:string,patientPassword:string):Observable<Object>{
    console.log(patientEmail+patientPassword)
     return this.http.get(`http://localhost:8887/patient/login?userName=${patientEmail}&password=${patientPassword}`); 
    
    
    

  }

  savePatient(patient:any){
    this.currentPatient=patient;

  }
  

  searchDoctors(location:string,specialization:string){ 

    return this.http.get(`http://localhost:8887/appointments/getDoctors?specialization=${specialization}&location=${location}`)

  }


  makeAppointment(appointment:Object):Observable<Object>{
    return this.http.post(`http://localhost:8887/appointments/makeAppointment`, appointment); 


  }

  viewAppointments():Observable<Object>{
    return this.http.get(`http://localhost:8887/appointments/getAllAppointments?email=${this.currentPatient.email}`); 

 
  }


 /*  createUser(userAccount: Object): Observable<Object> {
    console.log(userAccount)
    return this.http.post(`${this.baseUrl}` + `/create`, userAccount);
  } */ 
}
