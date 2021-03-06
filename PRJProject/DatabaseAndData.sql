USE [ProjectPRJ]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[CusID] [int] NOT NULL,
	[UserName] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NOT NULL,
	[isAdmin] [bit] NOT NULL,
	[DisplayName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[UserName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Category]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[CategoryID] [int] IDENTITY(1,1) NOT NULL,
	[CategoryName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Color]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Color](
	[ColorID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Color] [nvarchar](50) NULL,
 CONSTRAINT [PK_Color] PRIMARY KEY CLUSTERED 
(
	[ColorID] ASC,
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Customer]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Customer](
	[CusID] [int] IDENTITY(1,1) NOT NULL,
	[CusName] [nvarchar](50) NOT NULL,
	[CusPhone] [varchar](15) NOT NULL,
	[CusAddress] [nvarchar](150) NOT NULL,
	[DOB] [date] NOT NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[CusID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Order]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[CusID] [int] NOT NULL,
	[ShipDate] [date] NOT NULL,
	[ShipAddress] [nvarchar](150) NOT NULL,
	[Note] [text] NOT NULL,
	[OrderDate] [date] NOT NULL,
	[isShipped] [bit] NOT NULL,
	[isOnline] [bit] NOT NULL,
	[dept] [money] NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Order_Details]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order_Details](
	[Quantity] [int] NOT NULL,
	[UnitPrice] [money] NOT NULL,
	[OrderID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[ColorID] [int] NOT NULL,
	[SizeID] [int] NOT NULL,
 CONSTRAINT [PK_Order_Details_1] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC,
	[ProductID] ASC,
	[ColorID] ASC,
	[SizeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Product]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[ProductID] [int] IDENTITY(1,1) NOT NULL,
	[ProductName] [nvarchar](150) NOT NULL,
	[Price] [money] NOT NULL,
	[QuantityPerUnit] [int] NOT NULL,
	[CategoryID] [int] NOT NULL,
	[Description] [ntext] NOT NULL,
	[RetailPrice] [money] NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ProductImage]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ProductImage](
	[ProductID] [int] NOT NULL,
	[Image] [varchar](900) NOT NULL,
	[ImageID] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_ProductImage] PRIMARY KEY CLUSTERED 
(
	[ImageID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Quantity]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quantity](
	[ProductID] [int] NOT NULL,
	[ColorID] [int] NOT NULL,
	[SizeID] [int] NOT NULL,
	[Quantity] [int] NOT NULL,
 CONSTRAINT [PK_Quantity] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC,
	[ColorID] ASC,
	[SizeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Size]    Script Date: 3/16/2022 9:16:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Size](
	[SizeID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Size] [nvarchar](50) NULL,
 CONSTRAINT [PK_OptionValue_1] PRIMARY KEY CLUSTERED 
(
	[SizeID] ASC,
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Account] ([CusID], [UserName], [Password], [isAdmin], [DisplayName]) VALUES (3, N'MrA', N'123', 0, N'SupperMan')
INSERT [dbo].[Account] ([CusID], [UserName], [Password], [isAdmin], [DisplayName]) VALUES (2, N'NghiaNT', N'abcde', 0, N'Nghiangu')
INSERT [dbo].[Account] ([CusID], [UserName], [Password], [isAdmin], [DisplayName]) VALUES (1, N'VinhNT', N'12345', 1, N'Nguyễn Thế Vinh')
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([CategoryID], [CategoryName]) VALUES (1, N'Giày')
INSERT [dbo].[Category] ([CategoryID], [CategoryName]) VALUES (2, N'Dép')
INSERT [dbo].[Category] ([CategoryID], [CategoryName]) VALUES (3, N'Khác')
SET IDENTITY_INSERT [dbo].[Category] OFF
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (0, 4, N'None')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (0, 7, N'None')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (1, 1, N'Xanh')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (1, 2, N'Xanh')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (1, 3, N'Vàng')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (1, 5, N'Hồng')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (1, 6, N'Hồng')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (2, 1, N'Trắng')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (2, 2, N'Đỏ')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (2, 5, N'Xanh')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (2, 6, N'Đỏ')
INSERT [dbo].[Color] ([ColorID], [ProductID], [Color]) VALUES (3, 5, N'Cam')
SET IDENTITY_INSERT [dbo].[Customer] ON 

INSERT [dbo].[Customer] ([CusID], [CusName], [CusPhone], [CusAddress], [DOB]) VALUES (1, N'VinhNT', N'0969902069', N'Tiên Lãng Hải Phòng', CAST(N'2001-02-14' AS Date))
INSERT [dbo].[Customer] ([CusID], [CusName], [CusPhone], [CusAddress], [DOB]) VALUES (2, N'NghiaNT', N'0123456567', N'Tiên Lãng Hải Phòng', CAST(N'2001-02-12' AS Date))
SET IDENTITY_INSERT [dbo].[Customer] OFF
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [QuantityPerUnit], [CategoryID], [Description], [RetailPrice]) VALUES (1, N'Dép Fila', 250000.0000, 5, 2, N'Dép Fila phối màu siêu đẹp giành cho nam và nữa. Với cảm giác mềm mại và màu sắc đẹp, phù hợp với mọi lứa tuổi...', 55000.0000)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [QuantityPerUnit], [CategoryID], [Description], [RetailPrice]) VALUES (2, N'Dép màu tím', 300000.0000, 5, 2, N'Dép Nike cao cấp dành cho bé trai', 65000.0000)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [QuantityPerUnit], [CategoryID], [Description], [RetailPrice]) VALUES (3, N'Dép quả chuối siêu xinhh', 400000.0000, 5, 2, N'Dép quả chúi hihihi tôi đói quá, sao bài assignment nó gì mà nó dài quá vậy trời!!!!!!!', 90000.0000)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [QuantityPerUnit], [CategoryID], [Description], [RetailPrice]) VALUES (4, N'Gang tay lao động', 100000.0000, 10, 3, N'Gang tay lao động siêu xịn', 15000.0000)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [QuantityPerUnit], [CategoryID], [Description], [RetailPrice]) VALUES (5, N'Dép ABCD cho pé', 120000.0000, 6, 2, N'ABCD Baby shark duudududu, deadline duududududuudu, em buồn vì deadline làm em khóc huhuhu', 25000.0000)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [QuantityPerUnit], [CategoryID], [Description], [RetailPrice]) VALUES (6, N'Dép nhựa in hình kính cận', 400000.0000, 5, 2, N'Mệt mọi quá đi', 90000.0000)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [QuantityPerUnit], [CategoryID], [Description], [RetailPrice]) VALUES (7, N'Giày thể thao nam', 300000.0000, 1, 1, N'Giày thể thao', 400000.0000)
SET IDENTITY_INSERT [dbo].[Product] OFF
SET IDENTITY_INSERT [dbo].[ProductImage] ON 

INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (1, N'uploads/1e7dcade682a5b3a669a4cd347825ac1.jpg', 6)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (1, N'uploads/f64fed0e0493d5d6633a3b1562d4866c.jpg', 7)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (3, N'uploads/resize-164719042218114417803f1dfa6e95907dc63e1c198044c8c7cf.jpg', 9)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (4, N'uploads/resize-16472737231531523527db2f37eb2639a31b5fa067032f0859cquot.jpg', 10)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (4, N'uploads/resize-1647273696979685256882fe878342b21fd33d0996679eebc8quot.jpg', 11)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (4, N'uploads/resize-16472736701605151121a74f8586103e832b4c59c847de133dc0quot.jpg', 12)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (5, N'uploads/resize-164727546814064450332a6199b9481e0f7d62ab90e259b47389.jpg', 13)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (6, N'uploads/resize-164727722910660387217e17264afb6d91bf974d4a4280a38125.jpg', 14)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (2, N'uploads/resize-16473602191803055538626b64d4b4eb7c8fa998d5455041a2e6.jpg', 34)
INSERT [dbo].[ProductImage] ([ProductID], [Image], [ImageID]) VALUES (7, N'uploads/resize-164736860192824533678b198c265600d8a27508eeecb9e71d3.jpg', 35)
SET IDENTITY_INSERT [dbo].[ProductImage] OFF
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 1, 1, 100)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 1, 2, 100)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 1, 3, 100)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 1, 4, 100)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 1, 5, 100)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 2, 1, 100)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 2, 2, 100)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 2, 3, 120)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 2, 4, 120)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (1, 2, 5, 150)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (2, 1, 1, 12)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (2, 1, 2, 13)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (2, 2, 1, 14)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (2, 2, 2, 15)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (3, 1, 1, 30)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (3, 1, 2, 40)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (4, 0, 0, 1000)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (5, 1, 1, 11)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (5, 1, 2, 12)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (5, 2, 1, 13)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (5, 2, 2, 14)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (5, 3, 1, 15)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (5, 3, 2, 16)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (6, 1, 1, 11)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (6, 1, 2, 13)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (6, 2, 1, 12)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (6, 2, 2, 14)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (7, 0, 1, 30)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (7, 0, 2, 40)
INSERT [dbo].[Quantity] ([ProductID], [ColorID], [SizeID], [Quantity]) VALUES (7, 0, 3, 50)
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (0, 4, N'None')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (1, 1, N'36')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (1, 2, N'12')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (1, 3, N'40')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (1, 5, N'24')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (1, 6, N'40')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (1, 7, N'40')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (2, 1, N'37')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (2, 2, N'13')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (2, 3, N'41')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (2, 5, N'25')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (2, 6, N'41')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (2, 7, N'41')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (3, 1, N'38')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (3, 7, N'42')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (4, 1, N'39')
INSERT [dbo].[Size] ([SizeID], [ProductID], [Size]) VALUES (5, 1, N'40')
/****** Object:  Index [IX_Account]    Script Date: 3/16/2022 9:16:57 PM ******/
ALTER TABLE [dbo].[Account] ADD  CONSTRAINT [IX_Account] UNIQUE NONCLUSTERED 
(
	[CusID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Color]  WITH CHECK ADD  CONSTRAINT [FK_Color_Product] FOREIGN KEY([ProductID])
REFERENCES [dbo].[Product] ([ProductID])
GO
ALTER TABLE [dbo].[Color] CHECK CONSTRAINT [FK_Color_Product]
GO
ALTER TABLE [dbo].[Customer]  WITH CHECK ADD  CONSTRAINT [FK_Customer_Account] FOREIGN KEY([CusID])
REFERENCES [dbo].[Account] ([CusID])
GO
ALTER TABLE [dbo].[Customer] CHECK CONSTRAINT [FK_Customer_Account]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Customer] FOREIGN KEY([CusID])
REFERENCES [dbo].[Customer] ([CusID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Customer]
GO
ALTER TABLE [dbo].[Order_Details]  WITH CHECK ADD  CONSTRAINT [FK_Order_Details_Order] FOREIGN KEY([OrderID])
REFERENCES [dbo].[Order] ([OrderID])
GO
ALTER TABLE [dbo].[Order_Details] CHECK CONSTRAINT [FK_Order_Details_Order]
GO
ALTER TABLE [dbo].[Order_Details]  WITH CHECK ADD  CONSTRAINT [FK_Order_Details_Quantity] FOREIGN KEY([ProductID], [ColorID], [SizeID])
REFERENCES [dbo].[Quantity] ([ProductID], [ColorID], [SizeID])
GO
ALTER TABLE [dbo].[Order_Details] CHECK CONSTRAINT [FK_Order_Details_Quantity]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Category1] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Category] ([CategoryID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Category1]
GO
ALTER TABLE [dbo].[ProductImage]  WITH CHECK ADD  CONSTRAINT [FK_ProductImage_Product] FOREIGN KEY([ProductID])
REFERENCES [dbo].[Product] ([ProductID])
GO
ALTER TABLE [dbo].[ProductImage] CHECK CONSTRAINT [FK_ProductImage_Product]
GO
ALTER TABLE [dbo].[Quantity]  WITH CHECK ADD  CONSTRAINT [FK_Quantity_Color] FOREIGN KEY([ColorID], [ProductID])
REFERENCES [dbo].[Color] ([ColorID], [ProductID])
GO
ALTER TABLE [dbo].[Quantity] CHECK CONSTRAINT [FK_Quantity_Color]
GO
ALTER TABLE [dbo].[Quantity]  WITH CHECK ADD  CONSTRAINT [FK_Quantity_Size] FOREIGN KEY([SizeID], [ProductID])
REFERENCES [dbo].[Size] ([SizeID], [ProductID])
GO
ALTER TABLE [dbo].[Quantity] CHECK CONSTRAINT [FK_Quantity_Size]
GO
ALTER TABLE [dbo].[Size]  WITH CHECK ADD  CONSTRAINT [FK_Size_Product] FOREIGN KEY([ProductID])
REFERENCES [dbo].[Product] ([ProductID])
GO
ALTER TABLE [dbo].[Size] CHECK CONSTRAINT [FK_Size_Product]
GO
