import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/model/product';
import { PRODUCTS } from 'src/app/mock-products'

// src/app/mock-products.ts

@Component({
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css']
})
export class ProductItemComponent implements OnInit {

  product: Product | undefined
  products = PRODUCTS;

  constructor() { }

  ngOnInit(): void {
    this.product = new Product("1", "IphoneX", 400);
  }

  incrementPrice() : void{
    if(this.product != undefined) {
        console.log(this.product.price);
    }
  }

}
