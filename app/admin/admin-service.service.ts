import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {
  private baseUrl = 'http://localhost:5555/adminn';

  constructor(private http:HttpClient) { }


getAllDoctors():Observable<Object>{
  return this.http.get(`http://localhost:8887/viewdoctor/getAllDoctors`);  


}

getAllPatients():Observable<Object>{
  console.log("in service all patients")
  return this.http.get(`http://localhost:8887/adminviewpatient/getAllPatients`);

}

login(email:string,password:string):Observable<object>{
  return this.http.get(`http://localhost:8887/adminlogin/login?userName=${email}&password=${password}`);

}


}


