point p1 = (1, 2);
point p2 = (3, 4);
line l1 = from (p1) to (p2);
circle c1 = center(p1) radius=5;
point p3 = (5, 6);
print(distance(p1, p2));
print(distance(p1, p3));
printVariable(p1);
x = 5;
y = 7;
printVariable(x);
printVariable(y);
point p3 = (x, y);
printVariable(p3);
line l2 = from (x, y) to (x, y);
printVariable(l2);
circle c2 = center(x, y) radius=y;
printVariable(c2);
a = area(c2);
print(area(c2));
printVariable(a);
e = 2.6;
printVariable(e);