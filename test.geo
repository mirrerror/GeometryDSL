point p1 = (1, 2);
point p2 = (3, 4);
line l1 = from (p1) to (p2);
circle c1 = center(p1) radius=5;
point p3 = (5, 6);
print(distance(p1, p2));
print(distance(p1, p3));
print(p1);
x = 5;
y = 7;
print(x);
print(y);
point p3 = (x, y);
print(p3);
line l2 = from (x, y) to (x, y);
print(l2);
circle c2 = center(x, y) radius=y;
print(c2);
a = area(c2);
print(area(c2));
print(a);
e = 2.6;
print(e);

i = 0;
while(i < 24) {
    print(i);
    i = i + 8;
}