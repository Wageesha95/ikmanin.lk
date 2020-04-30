import {Location} from './Location';
export class User{
    id : String;
    userName : String;
    password : String;
    role : String;
    firstName : String;
	lastName : String;
    userLocation : Location;
	profilePicture : ImageData;
	emailVerification :boolean;
	accountCreatedDate  : Date;
}