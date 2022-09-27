package com.noterror.app.api.domain.product.controller;

import com.noterror.app.api.domain.entity.Product;
import com.noterror.app.api.domain.product.dto.ProductResponseDto;
import com.noterror.app.api.domain.product.service.ProductService;
import com.noterror.app.api.global.response.MultiProductResponse;
import com.noterror.app.api.global.response.SingleProductResponse;
import com.noterror.app.api.global.sort.Sort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 담당자 : 강시혁
 */
@RestController
@CrossOrigin
@Slf4j
@Validated
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * 제품 개별 조회
     * @param : productId
     */
    @GetMapping("/detail/{product-id}")
    public ResponseEntity getProduct(@PathVariable("product-id") Long productId) {

        ProductResponseDto response = productService.findProduct(productId);

        return new ResponseEntity(
                new SingleProductResponse(response),
                HttpStatus.OK);
    }

    /**
     * 제품 전체 조회
     */
    @GetMapping("/list")
    public ResponseEntity getProducts(@RequestParam(required = false, defaultValue = "1") int page,
                                      @RequestParam(required = false, defaultValue = "20") int size,
                                      @RequestParam(required = false, defaultValue = "signDate") String sort,
                                      @RequestParam(required = false, defaultValue = "desc") String orderBy) {

        Page<Product> productInPage =
                productService.findProductsWithPageAndSort(page-1,size,sort,orderBy);
        List<Product> productsInList = productInPage.getContent();

        Sort sortInfo = new Sort(sort, orderBy);

        return new ResponseEntity(
                new MultiProductResponse(
                        productsInList,productInPage,sortInfo
                ),
                HttpStatus.OK
        );

    }
<<<<<<< HEAD

=======
    
    /**
    * 제품 수정
    */
    @PutMapping("/admin/edit/{product-id}")
    public ResponseEntity patchProduct(@PathVariable("product-id") Long productId, @RequestBody @Valid ProductPatchDto productPatchDto){
        productPatchDto.setProductId(productId);
        Product Result = productService.updateProduct(mapper.productPatchDtoToProduct(productPatchDto));

        return new ResponseEntity<>(
                        new SingleProductResponse<>(mapper.productToProductResponseDto(Result)),
                        HttpStatus.OK);
    }
    
    /**
    * 제품 등록
    */
    @PostMapping("/admin/registration")
    public ResponseEntity<ProductResponseDto> postProduct(@RequestBody @Valid ProductPostDto productPostDto){
        Product sellerProductRequest = productService.createProduct(productPostDto);

        return new ResponseEntity(
                new SingleProductResponse(new ProductResponseDto(sellerProductRequest)), HttpStatus.CREATED);
    }
    
    /**
    * 제품 삭제
    */
    @DeleteMapping("/admin/edit/{productId}")
    public ResponseEntity deleteProduct(@PathVariable("productId") long ProductId) {
        productService.delete(ProductId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
>>>>>>> f468b30e2b59c96311bf19da3aab830808efc6a1
}
