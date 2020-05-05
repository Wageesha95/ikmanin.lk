import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import { ProfileComponent } from './components/profile/profile.component';
import { AdvertisementViewerComponent } from './components/advertisement-viewer/advertisement-viewer.component';





const routes: Routes = [
  { path: 'home',  component: HomeComponent },
  { path: 'profile',  component: ProfileComponent },
  { path: 'advertisement', component: AdvertisementViewerComponent},
  { path: '', redirectTo:'/home', pathMatch:'full'}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
