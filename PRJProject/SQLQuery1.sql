select *from Quantity where ProductID=1;

select *from Quantity as a join Size as b on a.ProductID = b.ProductID and a.SizeID = b.SizeID
						join Color as c on a.ProductID = c.ProductID and c.ColorID = a.ColorID
						join Product as d on a.ProductID = d.ProductID
						where d.ProductID = 6