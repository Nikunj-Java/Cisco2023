import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { UserClass } from './UserClass';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  url:string="https://jsonplaceholder.typicode.com/users";
  //url:string="http://localhost:8082/api/user";
  constructor(private http:HttpClient) { }

  getAllUsers(){
    return this.http.get<UserClass[]>(this.url);
  }
}
