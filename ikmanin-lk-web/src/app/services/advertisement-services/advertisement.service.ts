import { Injectable } from '@angular/core';
//import { HttpClient } from '@angular/common/http';

const url = "http://localhost:8080/api/test/"

@Injectable({
  providedIn: 'root'
})
export class AdvertisementService {

  constructor(
  //  private http:HttpClient
  ) { }


/*
  getAllAdvertisements(){
    return this.http.get('http://localhost:8080/api/test/advertisements');
  }*/
}
