����   > U
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  "Introduzca el color del cuadrado: 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextLine ()Ljava/lang/String; # !Introduzca el lado del cuadrado: 
  % & ' 
nextDouble ()D ) abbstr/Cuadrado
 ( +  , (Ljava/lang/String;D)V .  El área del cuadrado %s es: %f

 ( 0 1 ! getColor
 ( 3 4 ' calcularArea
 6 7 8 9 : java/lang/Double valueOf (D)Ljava/lang/Double;
  < = > printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; @ test/Prueba Code LineNumberTable LocalVariableTable this Ltest/Prueba; main ([Ljava/lang/String;)V args [Ljava/lang/String; colorDelCuadrado Ljava/lang/String; ladoDelCuadrado D teclado Ljava/util/Scanner; 	cuadrado1 Labbstr/Cuadrado; MethodParameters 
SourceFile Prueba.java ! ?           A   /     *� �    B        C        D E   	 F G  A   �     T� Y� 	� :� � � L� "� � $I� (Y+(� *:� -� Y� /SY� 2� 5S� ;W�    B   "           "  (  3  S  C   4    T H I    : J K  ( , L M   H N O  3 ! P Q  R    H    S    T