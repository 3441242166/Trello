package com.example.base;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.util.Log;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


public abstract class BasePresenter<V extends IView,M extends IModel> implements IPresenter {
    protected final String TAG = this.getClass().getSimpleName();

    protected V mView;
    protected M mModel;
    protected Context mContext;

    protected CompositeDisposable mCompositeDisposable;

    protected abstract M setModel();
    
    public BasePresenter(V view, Context context){
        this.mView = view;
        this.mContext = context;
        mModel = setModel();
    }

    /**
     * 添加 Disposable
     * @param disposable
     */
    public void addDispose(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);//将所有 Disposable 放入容器集中处理
    }

    /**
     * 取消所有 Disposable 订阅
     */
    private void unDispose() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();//保证 Activity 结束时取消所有正在执行的订阅
        }
    }

    @Override
    public void onCreate(LifecycleOwner owner) {
        Log.i(TAG, "BasePresenter onCreate");
    }

    @Override
    public void onDestroy(){
        Log.i(TAG, "BasePresenter onDestroy");
        unDispose();
        if (mModel != null){
            mModel.onDestroy();
        }
        this.mModel = null;
        this.mView = null;
        this.mCompositeDisposable = null;
    }

}
