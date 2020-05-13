import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { FlexLayoutModule } from '@angular/flex-layout';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import 'hammerjs';
import { SlideshowComponent } from './components/slideshow/slideshow.component';
import { LoginComponent } from './components/login/login.component';
import { FilterComponent } from './components/filter/filter.component';
import { AdvertisementsComponent } from './components/advertisements/advertisements.component';
import { SocialMediaComponent } from './components/social-media/social-media.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { ProfileComponent } from './components/profile/profile.component';
import { SignUpComponent } from './components/sign-up/sign-up.component';
import { HomeComponent } from './components/home/home.component';

import { AdvertisementService } from './services/advertisement-services/advertisement.service';
import { AdvertisementViewerComponent } from './components/advertisement-viewer/advertisement-viewer.component';
import { AddNewComponent } from './components/add-new/add-new.component';
import { FormsModule } from '@angular/forms';
import { ViewChild } from '@angular/core';


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
    HomeComponent,
    AdvertisementViewerComponent,
    AddNewComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    FlexLayoutModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [AdvertisementService],
  bootstrap: [AppComponent]
})
export class AppModule { }
