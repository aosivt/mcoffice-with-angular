import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { McoEmptyPageComponent } from './mco-empty-page.component';

describe('McoEmptyPageComponent', () => {
  let component: McoEmptyPageComponent;
  let fixture: ComponentFixture<McoEmptyPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ McoEmptyPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(McoEmptyPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
