import { Component, OnInit } from '@angular/core';
import { Advertisement } from '../../data-models/Advertisement';
import { AdvertisementService } from '../../services/advertisement-services/advertisement.service';
import { ViewChild } from '@angular/core';

@Component({
  selector: 'app-add-new',
  templateUrl: './add-new.component.html',
  styleUrls: ['./add-new.component.scss']
})
export class AddNewComponent implements OnInit {

  advertisement = new Advertisement;
  abc = 
  {
    "category": "van",
    "bio":"A new van, less usage",
    "price": "50000",
    "itemLocation":{
    	"town" : "Meegoda",
		"city":"Homagama",
		"district" :"COL"
    } ,
    "photos": ["pqr","ijk"],
    "tags": ["abc","def"],
    "condition":"new",
    "brand":"bajaj",
    "model":"ct100",
    "modelYear":"2005",
    "engineCapacity":"100",
    "mileage":"100000",
    "negotiability":"true",
    "description": "des of bike",
    "phoneNumber":"0773200982",
     "status": "Available"
}
  @ViewChild('advertisementForm') form: any;

  constructor(
    private advertisementService : AdvertisementService
  ) { }

  ngOnInit(): void {
  }

  onSubmit() { 
    this.advertisement.userId="5e9854be3bc34b73581b272d"
    this.advertisement.status=true;
    this.advertisement.lastUpdatedTime = new Date().toISOString()
    console.log(this.advertisement)
    
  }

  handleLogin(){
    this.advertisement.userId="5e9b7f55b3519e708848aace"
    this.advertisement.status=true;
    this.advertisement.lastUpdatedTime = new Date().toISOString()
    console.log(this.advertisement)
    this.form.reset()
    this.advertisementService.postAnAdvertisement(this.advertisement,this.advertisement.userId).subscribe(
      response => console.log(response)
    )
    
  }

}
