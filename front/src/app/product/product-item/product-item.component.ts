import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/model/product';

@Component({
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css']
})
export class ProductItemComponent implements OnInit {

  product: Product | undefined

  constructor() { }

  ngOnInit(): void {
    this.product = new Product("1", "IphoneX", 400);
  }

}
