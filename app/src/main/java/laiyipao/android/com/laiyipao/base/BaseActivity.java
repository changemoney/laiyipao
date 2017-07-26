package laiyipao.android.com.laiyipao.base;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.ActionBarActivity;

public class BaseActivity extends ActionBarActivity {

    protected boolean a;
    protected boolean b;
    //private dg c;
    private BroadcastReceiver d;

    public BaseActivity() {
        super();
        this.a = false;
        this.b = false;
        //this.c = new dg();
    }

//    public void a(r arg2) {
//        this.c.a(arg2);
//    }

    protected boolean b() {
        return false;
    }

    protected boolean c() {
        return false;
    }

    public boolean d() {
        return this.a;
    }

    public boolean e() {
        boolean v0 = !this.b ? true : false;
        return v0;
    }

    public boolean f() {
        return this.b;
    }

    protected void onActivityResult(int arg2, int arg3, Intent arg4) {
//        i v0 = g.c();
//        if (v0 == null || !v0.a(((Activity) this), arg2, arg3, arg4)) {
            super.onActivityResult(arg2, arg3, arg4);
//        }
    }

    protected void onCreate(Bundle arg5) {
        super.onCreate(arg5);
//        j v0 = g.a();
//        if (v0 != null && (this.c())) {
//            v0.a(((Context) this));
//        }
//
//        this.d = new b(this);
//        LocalBroadcastManager.getInstance(((Context) this)).registerReceiver(this.d, new IntentFilter("com.ss.android.common.app.action.exit_app"));
    }

    protected void onDestroy() {
        LocalBroadcastManager.getInstance(((Context) this)).unregisterReceiver(this.d);
        super.onDestroy();
//        this.b = true;
//        if (!this.c.b()) {
//            Iterator v1 = this.c.iterator();
//            while (v1.hasNext()) {
//                Object v0 = v1.next();
//                if (v0 == null) {
//                    continue;
//                }
//
//                ((r) v0).d();
//            }
//
//            this.c.a();
//        }
    }

    protected void onPause() {
        super.onPause();
        this.a = false;
//        if (this.b()) {
//            com.ss.android.common.f.a.b(((Context) this));
//        }
//
//        h v0 = g.b();
//        if (v0 != null) {
//            v0.b(((Activity) this));
//        }
//
//        if (!this.c.b()) {
//            Iterator v1 = this.c.iterator();
//            while (v1.hasNext()) {
//                Object v0_1 = v1.next();
//                if (v0_1 == null) {
//                    continue;
//                }
//
//                ((r) v0_1).b();
//            }
//        }
    }

    protected void onResume() {
        super.onResume();
        this.a = true;
//        if (this.b()) {
//            com.ss.android.common.f.a.a(((Context) this));
//        }
//
//        h v0 = g.b();
//        if (v0 != null) {
//            v0.a(((Activity) this));
//        }
//
//        if (!this.c.b()) {
//            Iterator v1 = this.c.iterator();
//            while (v1.hasNext()) {
//                Object v0_1 = v1.next();
//                if (v0_1 == null) {
//                    continue;
//                }
//
//                ((r) v0_1).a();
//            }
//        }
    }

    protected void onSaveInstanceState(Bundle arg3) {
        if (arg3 != null) {
            arg3.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }

        super.onSaveInstanceState(arg3);
    }

    protected void onStop() {
        super.onStop();
//        this.a = false;
//        if (!this.c.b()) {
//            Iterator v1 = this.c.iterator();
//            while (v1.hasNext()) {
//                Object v0 = v1.next();
//                if (v0 == null) {
//                    continue;
//                }
//
//                ((r) v0).c();
//            }
//        }
    }
}

