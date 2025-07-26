package myproject.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.baomidou.mybatisplus.annotation.*;
    import java.util.Date;

/**
* 汽车
*
*/

@Data
@TableName("qiche")
public class QicheEntity {
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
        * 汽车的型号
        */
        private String model;

        /**
        * 生产年份
        */
        private String year;

        /**
        * 销售价格
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
        * 库存
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
        * 车辆的分类
        */
        private String classify;

        /**
        * 创建人的id
        */
        private Long userid;

        /**
        * 创建人的名字
        */
        private String username;

        /**
        * 轮播图
        */
        private String photos;

        /**
        * 浏览量
        */
        private Integer clicknum;

        /**
        * 库存编号
        */
        private String number;

        /**
        * 创建时间
        */
        @TableField(fill = FieldFill.INSERT)
        private Date addtime;

}