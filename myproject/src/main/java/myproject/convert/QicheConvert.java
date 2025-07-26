package myproject.convert;

import myproject.entity.QicheEntity;
import myproject.vo.QicheVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 汽车
*
*/
@Mapper
public interface QicheConvert {
    QicheConvert INSTANCE = Mappers.getMapper(QicheConvert.class);

    QicheEntity convert(QicheVO vo);

    QicheVO convert(QicheEntity entity);

    List<QicheVO> convertList(List<QicheEntity> list);

}