import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { Routes, RouterModule, RouterLink} from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { TableModule } from './main-modules/table.module';
import { AppMaterialModule  } from './main-modules/material-module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderBackOfficeComponent } from './ui/components/header-back-office/header-back-office.component';
import { LoginComponent } from './ui/components/login-back-office/login.component';
import { ToolbarBackOfficeComponent } from './ui/components/toolbar-back-office/toolbar-back-office.component';
import { McoEmptyPageComponent } from './ui/components/mco-empty-page/mco-empty-page.component';

import { DictionaryService } from './services/dictionary-service';
import { WebSocketService } from './services/web-socket-service/web-socket-service';


@NgModule({
  declarations: [
    AppComponent, HeaderBackOfficeComponent, LoginComponent,
    ToolbarBackOfficeComponent, McoEmptyPageComponent
  ],
imports: [
   BrowserModule, CommonModule, AppMaterialModule , BrowserAnimationsModule, AppRoutingModule,
   HttpClientModule, AppMaterialModule,
   FormsModule, ReactiveFormsModule,
    TableModule, RouterModule.forRoot(AppRoutingModule.routers)
  ],
  entryComponents: [HeaderBackOfficeComponent],
  providers: [ToolbarBackOfficeComponent, DictionaryService, WebSocketService],
  bootstrap: [AppComponent],

})
export class AppModule {       }
