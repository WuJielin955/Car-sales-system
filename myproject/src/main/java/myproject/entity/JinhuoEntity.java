package myproject.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
    import java.util.Date;

/**
* 进货
*
*/

@Data
@TableName("jinhuo")
public class JinhuoEntity {
        /**
        * 主键
        */
        @TableId
        private Long id;

        /**
        * 汽车的名字
        */
        private String name;

        /**
        * 汽车类型
        */
        private String type;

        /**
        * 汽车的型号
        */
        private String model;

        /**
        * 生产年份
        */
        private String year;

        /**
        * 进货价格
        */
        private Float price;

        /**
        * 引擎类型
        */
        private String yinqin;

        /**
        * 变数器类型（手动/自动）
        */
        private String bianshuqi;

        /**
        * 里程数
        */
        private String lichengshu;

        /**
        * 颜色
        */
        private String color;

        /**
        * 车身类型(轿车/SUV/卡车)
        */
        private String cheshen;

        /**
        * 进货量
        */
        private Integer num;

        /**
        * 车辆的详细描述
        */
        private String details;

        /**
        * 车辆图片
        */
        private String photo;

        /**
        * 创建人的id
        */
        private Long userid;

        /**
        * 创建人的名字
        */
        private String username;

        /**
        * 创建时间
        */
        @TableField(fill = FieldFill.INSERT)
        private Date addtime;

}