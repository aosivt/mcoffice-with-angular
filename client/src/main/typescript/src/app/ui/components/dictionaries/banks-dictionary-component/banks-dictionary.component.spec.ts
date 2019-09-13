import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BanksDictionaryComponent } from './banks-dictionary.component';

describe('BanksDictionaryComponentComponent', () => {
  let component: BanksDictionaryComponent;
  let fixture: ComponentFixture<BanksDictionaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BanksDictionaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BanksDictionaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
