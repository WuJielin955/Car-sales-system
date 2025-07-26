# 丰田汽车销售管理系统

本项目为本人设计并开发，基于 Spring Boot 和前后端分离架构，开发了一个汽车销售管理系统。该系统旨在提升汽车销售企业的信息化水平，实现订单管理、汽车管理、数据分析等功能模块的整合与自动化。

---

## 🛠️ 技术栈

- 后端框架：Spring Boot
- 前端技术：HTML、CSS、JavaScript
- 前端框架：Vue.js（部分页面）
- 数据库：MySQL
- 架构模式：B/S 架构（浏览器/服务器）
- UML建模：StarUML

---

## 🎯 核心功能模块

### 用户端（前台）：
- 用户注册与登录
- 浏览汽车列表与详情
- 在线下单与支付确认
- 查看订单历史与状态
- 查看公告信息
- 编辑个人资料

### 管理端（后台）：
- 管理员登录
- 汽车信息录入、编辑与删除
- 分类管理
- 订单管理与状态更新
- 公告发布与维护
- 数据统计分析（销售与库存）

---

## 🧩 数据库设计

数据库采用 MySQL 设计，核心表包括：

- 用户表（user）
- 汽车信息表（car）
- 订单信息表（order）
- 公告信息表（announcement）
- 评论表、购物车表、收藏夹表等辅助表

数据库结构详见 `docs/database_schema.md`

---

## 📷 系统界面展示

- ![首页展示]!<img width="416" height="231" alt="image" src="https://github.com/user-attachments/assets/81fab789-1d22-43e9-9781-4447fd668f52" />
- ![汽车管理界面]!<img width="416" height="231" alt="image" src="https://github.com/user-attachments/assets/01851b3e-5f7b-420c-9bf3-6830118b83b9" />
- ![订单查看页面]!<img width="416" height="231" alt="image" src="https://github.com/user-attachments/assets/19b000de-ef71-4897-a709-0227ad745ed4" />


---

## 🚀 启动方式（开发环境）

1. 克隆项目：
   ```bash
   git clone https://github.com/WuJielin955/Car-sales-system.git
