package com.example.project.protobuf.service;

import com.example.project.protobuf.pb.Laptop;

import javax.naming.Context;
import java.util.logging.Filter;

public interface LaptopStore {
    void Save(Laptop laptop) throws Exception;
    Laptop Find(String id);
 //   void Search(Context ctx, Filter filter, LaptopStream stream);
}