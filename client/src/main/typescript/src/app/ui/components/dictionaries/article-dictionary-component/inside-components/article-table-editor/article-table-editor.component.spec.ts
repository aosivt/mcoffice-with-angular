import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ArticleTableEditorComponent } from './article-table-editor.component';

describe('ArticleTableEditorComponent', () => {
  let component: ArticleTableEditorComponent;
  let fixture: ComponentFixture<ArticleTableEditorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ArticleTableEditorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ArticleTableEditorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
