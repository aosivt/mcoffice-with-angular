import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ScantechRegDictionaryComponent } from './scantech-reg-dictionary.component';

describe('ScantechRegDictionaryComponent', () => {
  let component: ScantechRegDictionaryComponent;
  let fixture: ComponentFixture<ScantechRegDictionaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ScantechRegDictionaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ScantechRegDictionaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
