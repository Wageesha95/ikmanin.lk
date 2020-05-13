import { Component, OnInit } from '@angular/core';
import {Advertisement} from './../../data-models/Advertisement';
import { AdvertisementService } from './../../services/advertisement-services/advertisement.service';

const Advertisements : Advertisement[] = [
    
	{
		id : 'A01',
 userId : 'U01',
 category : 'Bike',
 bio: 'This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.',
 price : 50000,
 itemLocation : {
	 town:'Meegoda',
	 city:'Homagama',
	 district:'Col'
 },
 photos : [null],
 tags : ['bike','honda'],
 condition : 'new',
 brand : 'honda',
 model : 'Fz10000',
 modelYear : 2005,
 engineCapacity : 100,
 mileage : 20000,
 negotiability : true,
 description : 'aaaa bb ccc   ddd  ee',
 contactName : 'thilina',
 phoneNumber : '0112225558',
 lastUpdatedTime:'2019-06-15T16:51:08.681Z',
 status:true
	},
	{
		id : 'A01',
 userId : 'U01',
 category : 'Bike',
 bio: 'This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.',
 price : 50000,
 itemLocation : {
	 town:'Meegoda',
	 city:'Homagama',
	 district:'Col'
 },
 photos : [null],
 tags : ['bike','honda'],
 condition : 'new',
 brand : 'honda',
 model : 'Fz100',
 modelYear : 2005,
 engineCapacity : 100,
 mileage : 20000,
 negotiability : true,
 description : 'aaaa bb ccc   ddd  ee',
 contactName : 'thilina',
 phoneNumber : '0112225558',
 lastUpdatedTime:'2019-06-15T16:51:08.681Z',
 status:true
	},{
		id : 'A01',
 userId : 'U01',
 category : 'Bike',
 bio: 'This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.',
 price : 50000,
 itemLocation : {
	 town:'Meegoda',
	 city:'Homagama',
	 district:'Col'
 },
 photos : [null],
 tags : ['bike','honda'],
 condition : 'new',
 brand : 'honda',
 model : 'Fz100',
 modelYear : 2005,
 engineCapacity : 100,
 mileage : 20000,
 negotiability : true,
 description : 'aaaa bb ccc   ddd  ee',
 contactName : 'thilina',
 phoneNumber : '0112225558',
 lastUpdatedTime:'2019-06-15T16:51:08.681Z',
 status:true
	}
];

@Component({
  selector: 'app-advertisements',
  templateUrl: './advertisements.component.html',
  styleUrls: ['./advertisements.component.scss']
})
export class AdvertisementsComponent implements OnInit {

 
  selectedAd:Advertisement;
  advertisements:Advertisement[];
  constructor(
	private advertisementService : AdvertisementService
	) { }

  ngOnInit(): void {
		this.getAllAdvertisements();		
	}
	
	getAllAdvertisements():void{
		
	this.advertisementService.getAllAdvertisements().subscribe(
		(ads) => {
			console.log(ads)
			this.advertisements = ads
		});
	
	}

  onSelect(selectedAdvertisement:Advertisement){
		this.selectedAd=selectedAdvertisement;	
	}
	

}
