import { Component, OnInit } from '@angular/core';
import {UserBasic} from './../../data-models/UserBasic';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.scss']
})
export class SignUpComponent implements OnInit {

  basic_user:UserBasic;

  constructor() { }

  ngOnInit(): void {
  }

}
