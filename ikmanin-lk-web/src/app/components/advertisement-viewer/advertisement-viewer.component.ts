import { Component, OnInit } from '@angular/core';
import { Advertisement } from '../../data-models/Advertisement';

@Component({
  selector: 'app-advertisement-viewer',
  templateUrl: './advertisement-viewer.component.html',
  styleUrls: ['./advertisement-viewer.component.scss']
})
export class AdvertisementViewerComponent implements OnInit {

selectedAd:Advertisement = {
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
condition : 'New',
brand : 'Honda',
model : 'Fz10000',
modelYear : 2005,
engineCapacity : 100,
mileage : 20000,
negotiability : true,
description : 'This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.',
contactName : 'Thilina',
phoneNumber : '0112225558',
lastUpdatedTime:'2019-06-15T16:51:08.681Z',
status:true
};

  constructor() { }

  ngOnInit(): void {

  }

}
