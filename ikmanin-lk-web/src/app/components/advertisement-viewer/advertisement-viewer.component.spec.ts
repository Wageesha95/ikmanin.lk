import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdvertisementViewerComponent } from './advertisement-viewer.component';

describe('AdvertisementViewerComponent', () => {
  let component: AdvertisementViewerComponent;
  let fixture: ComponentFixture<AdvertisementViewerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdvertisementViewerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdvertisementViewerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
