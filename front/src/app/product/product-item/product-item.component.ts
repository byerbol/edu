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
  selectedProduct: Product;

  constructor() { }

  ngOnInit(): void {

    this.selectedProduct = {
      id: '9999',
      name: 'My Test Product',
      imageUrl: 'https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/macbook-air-gold-select-201810?wid=892&hei=820&&qlt=80&.v=1603332211000',
      price: 50,
      isOnSale: true,
      quantityInCart: 0
    };

  }

  incrementInCart() : void{
    if(this.selectedProduct != undefined)
      this.selectedProduct.quantityInCart++;
  }

  decrementInCart() {
    if(this.selectedProduct != undefined && this.selectedProduct.quantityInCart > 0) {
      this.selectedProduct.quantityInCart--;
    }
  }

  onSelect(product: Product): void {
    console.log(this.selectedProduct?.name)
    this.selectedProduct = product;
  }

}
