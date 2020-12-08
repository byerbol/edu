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

  products = PRODUCTS;
  selectedProduct: Product | undefined;

  constructor() { }

  ngOnInit(): void {

  }

  incrementPrice(product: Product) : void{
    product.price++;
  }

  onSelect(product: Product): void {
    console.log(this.selectedProduct?.name)
    this.selectedProduct = product;
  }

}
