package com.noterror.app.api.domain.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD:server/src/main/java/com/noterror/app/api/domain/product/dto/ProductRequestDto.java
public class ProductRequestDto {
=======
public class ProductPostDto {
    @NotBlank(message = "이름을 입력해주세요.")
    @Length(max=50)
>>>>>>> f468b30e2b59c96311bf19da3aab830808efc6a1:server/src/main/java/com/noterror/app/api/domain/product/dto/ProductPostDto.java
    private String productName;

    @NotBlank(message = "수량을 입력해주세요.")
    @Min(1)
    private int quantity;

    @NotBlank(message = "가격을 입력해주세요.")
    @Min(100)
    private int price;

    @NotBlank(message = "썸네일 이미지를 첨부해주세요.")
    private String thumbnailImage;

    @NotBlank(message = "상세 설명 이미지를 첨부해주세요.")
    private  String detailImage;
}
