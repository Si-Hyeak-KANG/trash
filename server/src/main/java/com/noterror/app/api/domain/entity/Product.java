package com.noterror.app.api.domain.entity;

import com.noterror.app.api.domain.product.dto.ProductRequestDto;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private int price;

<<<<<<< HEAD
=======
    @Column(nullable = false)
>>>>>>> f468b30e2b59c96311bf19da3aab830808efc6a1
    private int quantity;

    @Column(nullable = false)
    private LocalDateTime signDate = LocalDateTime.now();

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String thumbnailImage;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String detailImage;

    // TODO : 식재료
    // TODO : 카테고리

    //== BUSINESS LOGIC ==//
    public void updateProductInfo(ProductRequestDto productRequestDto) {
        this.productName = productRequestDto.getProductName();
        this.quantity = productRequestDto.getQuantity();
        this.price = productRequestDto.getPrice();
        this.thumbnailImage = productRequestDto.getThumbnailImage();
        this.detailImage = productRequestDto.getDetailImage();
    }
}