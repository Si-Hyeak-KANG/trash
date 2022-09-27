<<<<<<< HEAD
package com.noterror.app.api.domain.product.mapper;

import com.noterror.app.api.domain.entity.Product;
import com.noterror.app.api.domain.product.dto.ProductRequestDto;
import com.noterror.app.api.domain.product.dto.ProductResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-26T21:42:33+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productRequestDtoToProduct(ProductRequestDto request) {
        if ( request == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.productName( request.getProductName() );
        product.price( request.getPrice() );
        product.quantity( request.getQuantity() );
        product.thumbnailImage( request.getThumbnailImage() );
        product.detailImage( request.getDetailImage() );

        return product.build();
    }

    @Override
    public ProductResponseDto productToProductResponseDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponseDto.ProductResponseDtoBuilder productResponseDto = ProductResponseDto.builder();

        productResponseDto.productId( product.getProductId() );
        productResponseDto.productName( product.getProductName() );
        productResponseDto.quantity( product.getQuantity() );
        productResponseDto.price( product.getPrice() );
        productResponseDto.signDate( product.getSignDate() );
        productResponseDto.thumbnailImage( product.getThumbnailImage() );
        productResponseDto.detailImage( product.getDetailImage() );

        return productResponseDto.build();
    }
}
=======
package com.noterror.app.api.domain.product.mapper;

import com.noterror.app.api.domain.entity.Product;
import com.noterror.app.api.domain.product.dto.ProductPatchDto;
import com.noterror.app.api.domain.product.dto.ProductResponseDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-27T13:37:04+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productPatchDtoToProduct(ProductPatchDto productPatchDto) {
        if ( productPatchDto == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.productId( productPatchDto.getProductId() );
        product.productName( productPatchDto.getProductName() );
        product.price( productPatchDto.getPrice() );
        product.quantity( productPatchDto.getQuantity() );
        product.thumbnailImage( productPatchDto.getThumbnailImage() );
        product.detailImage( productPatchDto.getDetailImage() );

        return product.build();
    }

    @Override
    public ProductResponseDto productToProductResponseDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponseDto.ProductResponseDtoBuilder productResponseDto = ProductResponseDto.builder();

        productResponseDto.productId( product.getProductId() );
        productResponseDto.productName( product.getProductName() );
        productResponseDto.quantity( product.getQuantity() );
        productResponseDto.price( product.getPrice() );
        productResponseDto.signDate( product.getSignDate() );
        productResponseDto.thumbnailImage( product.getThumbnailImage() );
        productResponseDto.detailImage( product.getDetailImage() );

        return productResponseDto.build();
    }
}
>>>>>>> f468b30e2b59c96311bf19da3aab830808efc6a1
