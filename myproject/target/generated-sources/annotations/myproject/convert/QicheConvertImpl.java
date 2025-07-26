package myproject.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import myproject.entity.QicheEntity;
import myproject.vo.QicheVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-10T18:15:12+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
public class QicheConvertImpl implements QicheConvert {

    @Override
    public QicheEntity convert(QicheVO vo) {
        if ( vo == null ) {
            return null;
        }

        QicheEntity qicheEntity = new QicheEntity();

        qicheEntity.setId( vo.getId() );
        qicheEntity.setName( vo.getName() );
        qicheEntity.setModel( vo.getModel() );
        qicheEntity.setYear( vo.getYear() );
        qicheEntity.setPrice( vo.getPrice() );
        qicheEntity.setYinqin( vo.getYinqin() );
        qicheEntity.setBianshuqi( vo.getBianshuqi() );
        qicheEntity.setLichengshu( vo.getLichengshu() );
        qicheEntity.setColor( vo.getColor() );
        qicheEntity.setCheshen( vo.getCheshen() );
        qicheEntity.setNum( vo.getNum() );
        qicheEntity.setDetails( vo.getDetails() );
        qicheEntity.setPhoto( vo.getPhoto() );
        qicheEntity.setClassify( vo.getClassify() );
        qicheEntity.setUserid( vo.getUserid() );
        qicheEntity.setUsername( vo.getUsername() );
        qicheEntity.setPhotos( vo.getPhotos() );
        qicheEntity.setClicknum( vo.getClicknum() );
        qicheEntity.setNumber( vo.getNumber() );
        qicheEntity.setAddtime( vo.getAddtime() );

        return qicheEntity;
    }

    @Override
    public QicheVO convert(QicheEntity entity) {
        if ( entity == null ) {
            return null;
        }

        QicheVO qicheVO = new QicheVO();

        qicheVO.setId( entity.getId() );
        qicheVO.setName( entity.getName() );
        qicheVO.setModel( entity.getModel() );
        qicheVO.setYear( entity.getYear() );
        qicheVO.setPrice( entity.getPrice() );
        qicheVO.setYinqin( entity.getYinqin() );
        qicheVO.setBianshuqi( entity.getBianshuqi() );
        qicheVO.setLichengshu( entity.getLichengshu() );
        qicheVO.setColor( entity.getColor() );
        qicheVO.setCheshen( entity.getCheshen() );
        qicheVO.setNum( entity.getNum() );
        qicheVO.setDetails( entity.getDetails() );
        qicheVO.setPhoto( entity.getPhoto() );
        qicheVO.setClassify( entity.getClassify() );
        qicheVO.setUserid( entity.getUserid() );
        qicheVO.setUsername( entity.getUsername() );
        qicheVO.setPhotos( entity.getPhotos() );
        qicheVO.setClicknum( entity.getClicknum() );
        qicheVO.setNumber( entity.getNumber() );
        qicheVO.setAddtime( entity.getAddtime() );

        return qicheVO;
    }

    @Override
    public List<QicheVO> convertList(List<QicheEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<QicheVO> list1 = new ArrayList<QicheVO>( list.size() );
        for ( QicheEntity qicheEntity : list ) {
            list1.add( convert( qicheEntity ) );
        }

        return list1;
    }
}
