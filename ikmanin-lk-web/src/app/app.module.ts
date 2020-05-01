import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//import { HttpClient } from '@angular/common/http';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar'; 
import { FlexLayoutModule } from '@angular/flex-layout';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import 'hammerjs';
import { SlideshowComponent } from './slideshow/slideshow.component';
import { LoginComponent } from './login/login.component';
import { FilterComponent } from './filter/filter.component';
import { AdvertisementsComponent } from './advertisements/advertisements.component';
import { SocialMediaComponent } from './social-media/social-media.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ProfileComponent } from './profile/profile.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { HomeComponent } from './home/home.component';

import { AdvertisementService } from './services/advertisement-services/advertisement.service' 
import { HttpClient } from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    SlideshowComponent,
    LoginComponent,
    FilterComponent,
    AdvertisementsComponent,
    SocialMediaComponent,
    HeaderComponent,
    FooterComponent,
    ProfileComponent,
    SignUpComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    FlexLayoutModule,
    HttpClient
  ],
  providers: [AdvertisementService],
  bootstrap: [AppComponent]
})
export class AppModule { }
