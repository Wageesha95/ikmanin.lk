import {Location} from './Location';

export class Advertisement{
     id : String;
	 userId : String;
	 category : String;
	 bio:String;
	 price : Number;
	 itemLocation : Location;
	 photos : Array<String>;
	 tags : Array<String>;
	 condition : String;
	 brand : String;
	 model : String;
	 modelYear : Number;
	 engineCapacity : Number;
	 mileage : Number;
	 negotiability : boolean;
	 description : String;
	 contactName : String;
     phoneNumber : String;
     lastUpdatedTime: string;
	 status:Boolean;
}