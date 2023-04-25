package com.shop.Dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType; //현재시간과 상품 등록일을 비교해서 상품 데이터를 조회함 p267참고

    private ItemSellStatus searchSellStatus; //상품판매 상태를 기준

    private String searchBy; //상품을 조회할때 어떤 유형으로 조회할지 선택

    private String searchQuery = ""; 

}
