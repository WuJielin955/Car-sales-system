package myproject.convert;

import myproject.entity.JinhuoEntity;
import myproject.vo.JinhuoVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 进货
*
*/
@Mapper
public interface JinhuoConvert {
    JinhuoConvert INSTANCE = Mappers.getMapper(JinhuoConvert.class);

    JinhuoEntity convert(JinhuoVO vo);

    JinhuoVO convert(JinhuoEntity entity);

    List<JinhuoVO> convertList(List<JinhuoEntity> list);

}