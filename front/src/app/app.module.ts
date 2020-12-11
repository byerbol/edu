import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductItemComponent } from './product/product-item/product-item.component';
import { FormsModule } from '@angular/forms';
import { ProductListComponent } from './product-list/product-list.component'; // <-- NgModel lives here

@NgModule({
  declarations: [
    AppComponent,
    ProductItemComponent,
    ProductListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
