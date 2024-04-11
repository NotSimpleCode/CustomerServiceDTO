package co.edu.uptc.swii.customerservicedto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uptc.swii.customerservicedto.dto.CustomerItemDTO;
import co.edu.uptc.swii.customerservicedto.entity.CustomerItem;

@Mapper
public interface CustomerItemMapper {
    CustomerItemMapper INSTANCE = Mappers.getMapper(CustomerItemMapper.class);

    CustomerItem mapCustomerItemDTOToCustomerItem(CustomerItemDTO customerItemDTO);

    CustomerItemDTO mapCustomerItemToCustomerItemDto(CustomerItem customerItem);

}
