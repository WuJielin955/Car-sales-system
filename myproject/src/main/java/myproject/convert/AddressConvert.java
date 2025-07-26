package myproject.convert;

import myproject.entity.AddressEntity;
import myproject.vo.AddressVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 地址
*
*/
@Mapper
public interface AddressConvert {
    AddressConvert INSTANCE = Mappers.getMapper(AddressConvert.class);

    AddressEntity convert(AddressVO vo);

    AddressVO convert(AddressEntity entity);

    List<AddressVO> convertList(List<AddressEntity> list);

}