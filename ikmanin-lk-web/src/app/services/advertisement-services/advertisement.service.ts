import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Advertisement } from '../../data-models/Advertisement';

const url = "http://localhost:8080/api/test/"

@Injectable({
  providedIn: 'root'
})
export class AdvertisementService {

  constructor(
    private http:HttpClient
  ) { }



  getAllAdvertisements(){
    return this.http.get<Advertisement[]>('http://localhost:8080/api/test/advertisements');
  }

  postAnAdvertisement(newAdvertisement:any,userId:String){
    return this.http.post(`http://localhost:8080/api/test/advertisement/${userId}`,newAdvertisement);
  }
}
